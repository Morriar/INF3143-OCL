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
package inf3143.logique.exemples.banque;

import java.util.ArrayList;
import java.util.List;

//La classe ModelInstance fournit une instance du modèle pour Dresden OCL.
public class ModelInstance {

	public static List<Object> getModelObjects() {
		List<Object> result = new ArrayList<Object>();

		Compte c1 = new Compte();
		//Compte c2 = new Compte();
		//Compte c3 = new Compte();

		result.add(c1);
		//result.add(c2);
		//result.add(c3);

		return result;
	}
}