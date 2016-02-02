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
package inf3143.logique.exercices.ex1;

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

		Professeur p1 = new Professeur(null, null);
		Professeur p2 = new Professeur("p2", u1);
		Professeur p3 = new Professeur("p3", u2);

		result.add(p1);
		result.add(p2);
		result.add(p3);

		Cours c1 = new Cours("11", 0.0, u1, p2);
		Cours c2 = new Cours("222", 100.0, u1, p3);
		Cours c3 = new Cours("333", -1.0, u2, p3);

		result.add(c1);
		result.add(c2);
		result.add(c3);

		return result;
	}
}