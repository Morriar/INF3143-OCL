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
package inf3143.collections.exercices;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//La classe ModelInstance fournit une instance du modèle pour Dresden OCL.
public class ModelInstance {

	public static List<Object> getModelObjects() {
		List<Object> result = new ArrayList<Object>();

		Equipe e1 = new Equipe("e1", false);
		Equipe e2 = new Equipe("e2", false);
		Equipe e3 = new Equipe("e3", true);
		Equipe e4 = new Equipe("e4", true);

		result.add(e1);
		result.add(e2);
		result.add(e3);
		result.add(e4);

		Joueur j1 = new Joueur("j", 10, e1);
		e1.joueurs.add(j1);
		Joueur j2 = new Joueur("j", 18, e1);
		e1.joueurs.add(j2);
		Joueur j3 = new Joueur("k", 22, e2);
		e2.joueurs.add(j3);
		Joueur j4 = new Joueur("j", 45, e3);
		e3.joueurs.add(j1);
		e3.joueurs.add(j4);
		Joueur j5 = new Joueur("m", 66, e4);
		e4.joueurs.add(j1);
		e4.joueurs.add(j5);
		Joueur j6 = new Joueur("j", 10, e4);
		e4.joueurs.add(j6);

		result.add(j1);
		result.add(j2);
		result.add(j3);
		result.add(j4);
		result.add(j5);
		result.add(j6);

		Tournoi t1 = new Tournoi(new Date(), false);
		t1.equipes.add(e1);
		e1.tournois.add(t1);
		t1.equipes.add(e2);
		e2.tournois.add(t1);
		t1.equipes.add(e3);
		e3.tournois.add(t1);

		Tournoi t2 = new Tournoi(new Date(), true);
		t2.equipes.add(e2);
		e2.tournois.add(t2);
		t2.equipes.add(e3);
		e3.tournois.add(t2);
		t2.equipes.add(e4);
		e4.tournois.add(t2);

		result.add(t1);
		result.add(t2);

		Match m11 = new Match(t1, e2, true);
		e1.matches.add(m11);
		Match m12 = new Match(t1, e1, false);
		e2.matches.add(m12);

		Match m21 = new Match(t1, e3, true);
		e1.matches.add(m21);
		Match m22 = new Match(t1, e1, false);
		e3.matches.add(m22);

		Match m31 = new Match(t1, e3, true);
		e2.matches.add(m31);
		Match m32 = new Match(t1, e2, false);
		e3.matches.add(m32);

		result.add(m11);
		result.add(m12);
		result.add(m21);
		result.add(m22);
		result.add(m31);
		result.add(m32);

		Match m41 = new Match(t2, e2, false);
		e1.matches.add(m41);
		Match m42 = new Match(t2, e1, true);
		e2.matches.add(m42);

		Match m51 = new Match(t2, e3, false);
		e1.matches.add(m51);
		Match m52 = new Match(t2, e1, true);
		e3.matches.add(m52);

		Match m61 = new Match(t2, e3, false);
		e2.matches.add(m61);
		Match m62 = new Match(t2, e2, true);
		e3.matches.add(m62);

		result.add(m41);
		result.add(m42);
		result.add(m51);
		result.add(m52);
		result.add(m61);
		result.add(m62);

		Tournoi t3 = new Tournoi(new Date(1234567890), true);
		result.add(t3);

		return result;
	}
}