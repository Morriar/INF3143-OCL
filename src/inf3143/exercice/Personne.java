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

public class Personne {
	public String nom;
	public String prenom;
	public Integer age;
	public Genre genre;

	public Personne(String nom, String prenom, Integer age, Genre genre) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.genre = genre;
	}

	public Boolean marie = false;
	public Boolean chomeur = true;
	public Mariage mariage = null;

	public List<Compte> comptes = new ArrayList<Compte>();
	public List<Personne> parents = new ArrayList<Personne>();
	public List<Personne> enfants = new ArrayList<Personne>();
	public List<Poste> postes = new ArrayList<Poste>();

	public Double revenu() {
		return 0.0;
	}
}