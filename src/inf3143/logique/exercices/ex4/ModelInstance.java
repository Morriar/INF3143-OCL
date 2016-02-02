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
package inf3143.logique.exercices.ex4;

import java.util.ArrayList;
import java.util.List;

// La classe ModelInstance fournit une instance du modèle pour Dresden OCL.
public class ModelInstance {

	public static List<Object> getModelObjects() {
		List<Object> result = new ArrayList<Object>();

		Permis p0 = new Permis();
		p0.points = 0;
		Permis p6 = new Permis();
		p6.points = 6;
		Permis p10 = new Permis();
		p10.points = 10;

		result.add(p0);
		result.add(p6);
		result.add(p10);

		Vehicule v1 = new Vehicule("auto", 10000);
		Vehicule v2 = new Vehicule("auto", 100000);
		Vehicule v3 = new Vehicule("moto", 100);

		result.add(v1);
		result.add(v2);
		result.add(v3);

		Assurance a1 = new Assurance("auto", 25000, v1);
		Assurance a2 = new Assurance("auto", 25000, v2);
		Assurance a3 = new Assurance("auto", 25000, v3);

		result.add(a1);
		result.add(a2);
		result.add(a3);

		Assure s1 = new Assure(p10);
		Assure s2 = new Assure(p0);
		s2.assurance = a1;
		Assure s3 = new Assure(p6);
		s3.assurance = a2;

		result.add(s1);
		result.add(s2);
		result.add(s3);

		return result;
	}
}