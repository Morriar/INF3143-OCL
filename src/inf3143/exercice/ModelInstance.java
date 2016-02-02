/*
 * Copyright 2016 Alexandre Terrasa <alexandre@moz-code.org>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package inf3143.exercice;

import java.util.ArrayList;
import java.util.List;

//La classe ModelInstance fournit une instance du modèle pour Dresden OCL.
public class ModelInstance {

	public static List<Object> getModelObjects() {
		List<Object> result = new ArrayList<Object>();

		// Societe valide

		Personne p1 = new Personne("p1", "pp1", 50, Genre.homme);
		p1.chomeur = false;
		Compte c1 = new Compte();
		p1.comptes.add(c1);
		Societe s1 = new Societe(p1);
		Poste j1 = new Poste(s1, p1, 2000.0, c1);
		s1.postes.add(j1);
		p1.postes.add(j1);

		result.add(p1);
		result.add(c1);
		result.add(s1);
		result.add(j1);

		// Societe invalide (directeur.age <= 40)

		Personne p2 = new Personne("p2", "pp2", 40, Genre.femme);
		p2.chomeur = false;
		Compte c2 = new Compte();
		p2.comptes.add(c2);
		Societe s2 = new Societe(p2);
		Poste j2 = new Poste(s2, p2, 2000.0, c2);
		s2.postes.add(j2);
		p2.postes.add(j2);

		result.add(p2);
		result.add(c2);
		result.add(s2);
		result.add(j2);

		// Societe invalide (directeur est chomeur)

		Personne p3 = new Personne("p3", "pp3", 70, Genre.femme);
		p3.chomeur = true;
		Compte c3 = new Compte();
		p3.comptes.add(c3);
		Societe s3 = new Societe(p3);
		Poste j3 = new Poste(s3, p3, 2000.0, c3);
		s3.postes.add(j3);
		p3.postes.add(j3);

		result.add(p3);
		result.add(c3);
		result.add(s3);
		result.add(j3);

		// Societe invalide (directeur = null)

		Societe s4 = new Societe(null);
		result.add(s4);

		// Societe invalide (directeur n'est pas un employé)

		Personne p5 = new Personne("p5", "pp5", 70, Genre.femme);
		p5.chomeur = false;
		Societe s5 = new Societe(p5);

		result.add(p5);
		result.add(s5);

		// Personne valide (chomage and revenus < 100)
		Personne p6 = new Personne("p6", "pp6", 18, Genre.homme);
		p6.chomeur = true;

		result.add(p6);

		// Personne valide (not chomage and revenus >= 100)

		Personne p7 = new Personne("p7", "pp7", 18, Genre.femme);
		p7.chomeur = false;
		Compte c7 = new Compte();
		Poste j7 = new Poste(s1, p7, 1000.0, c7);
		s1.postes.add(j7);
		p7.postes.add(j7);

		result.add(p7);
		result.add(c7);
		result.add(j7);

		// Personne invalide (chomage and revenus >= 100)

		Personne p8 = new Personne("p8", "pp8", 18, Genre.femme);
		p8.chomeur = true;
		Compte c8 = new Compte();
		Poste j8 = new Poste(s1, p8, 1000.0, c8);
		s1.postes.add(j8);
		p8.postes.add(j8);

		result.add(p8);
		result.add(c8);
		result.add(j8);

		// Personne invalide (not chomage and revenus < 100)

		Personne p9 = new Personne("p9", "pp9", 18, Genre.femme);
		p9.chomeur = false;
		Compte c9 = new Compte();
		Poste j9 = new Poste(s1, p9, 10.0, c9);
		s1.postes.add(j9);
		p9.postes.add(j9);

		result.add(p9);
		result.add(c9);
		result.add(j9);

		// Personne valide (<= 2 parents)

		Personne p10 = new Personne("p10", "pp10", 18, Genre.homme);
		Personne p11 = new Personne("p11", "pp11", 18, Genre.femme);
		Personne p12 = new Personne("p12", "pp12", 18, Genre.homme);

		p10.parents.add(p11);
		p10.parents.add(p12);

		result.add(p10);
		result.add(p11);
		result.add(p12);

		// Personne invalide (> 2 parents)

		Personne p13 = new Personne("p13", "pp13", 18, Genre.homme);
		Personne p14 = new Personne("p14", "pp14", 18, Genre.homme);
		Personne p15 = new Personne("p15", "pp15", 18, Genre.homme);
		Personne p16 = new Personne("p16", "pp16", 18, Genre.homme);

		p13.parents.add(p14);
		p13.parents.add(p15);
		p13.parents.add(p16);

		result.add(p13);
		result.add(p14);
		result.add(p15);
		result.add(p16);

		// Personne valide (2 parents homme)

		Personne p17 = new Personne("p17", "pp17", 18, Genre.homme);
		Personne p18 = new Personne("p18", "pp18", 18, Genre.homme);
		Personne p19 = new Personne("p19", "pp19", 18, Genre.homme);

		p17.parents.add(p18);
		p17.parents.add(p19);

		result.add(p17);
		result.add(p18);
		result.add(p19);

		return result;
	}
}