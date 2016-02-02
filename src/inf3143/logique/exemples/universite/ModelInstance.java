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
package inf3143.logique.exemples.universite;

import java.util.ArrayList;
import java.util.List;

//La classe ModelInstance fournit une instance du modèle pour Dresden OCL.
public class ModelInstance {

	public static List<Object> getModelObjects() {
		List<Object> result = new ArrayList<Object>();

		Etudiant e1 = new Etudiant("e1", 0.0);
		Etudiant e2 = new Etudiant("e2", 1000.0);
		Etudiant e3 = new Etudiant("", -10.0);
		e3.inscrire();

		result.add(e1);
		result.add(e2);
		result.add(e3);

		Cours c1 = new Cours("INF3143");
		Cours c2 = new Cours("INF5000");
		Cours c3 = new Cours("");

		result.add(c1);
		result.add(c2);
		result.add(c3);

		return result;
	}
}