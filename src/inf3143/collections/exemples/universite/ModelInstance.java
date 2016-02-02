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
package inf3143.collections.exemples.universite;

import java.util.ArrayList;
import java.util.List;

//La classe ModelInstance fournit une instance du modèle pour Dresden OCL.
public class ModelInstance {

	public static List<Object> getModelObjects() {
		List<Object> result = new ArrayList<Object>();

		Universite u1 = new Universite();
		Universite u2 = new Universite();
		Universite u3 = new Universite();

		result.add(u1);
		result.add(u2);
		result.add(u3);

		Professeur p1 = new Professeur(null, null, 55, "mat1");
		Professeur p2 = new Professeur("p2", u1, 25, "mat2");
		u1.professeurs.add(p2);
		Professeur p3 = new Professeur("p3", u2, 62, "mat3");
		u2.professeurs.add(p3);
		Professeur p4 = new Professeur("p4", u2, 12, "mat3");
		u2.professeurs.add(p4);

		result.add(p1);
		result.add(p2);
		result.add(p3);
		result.add(p4);

		Cours c1 = new Cours("INF1120", 0.0, u1, p2);
		Cours c2 = new Cours("INF3143", 100.0, u1, p3);
		Cours c3 = new Cours("INF5000", -1.0, u2, p3);

		result.add(c1);
		result.add(c2);
		result.add(c3);

		Etudiant e1 = new Etudiant("e1", 0.0);
		e1.cours.add(c1);
		e1.cours.add(c2);
		e1.cours.add(c3);
		Etudiant e2 = new Etudiant("e2", 0.0);
		e2.cours.add(c2);
		e2.cours.add(c3);

		result.add(e1);
		result.add(e2);

		return result;
	}
}