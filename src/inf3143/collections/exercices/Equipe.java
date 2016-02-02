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
import java.util.List;

public class Equipe {
	public String nom;
	public Boolean pro;

	public Equipe(String nom, Boolean pro) {
		this.nom = nom;
		this.pro = pro;
	}

	public List<Tournoi> tournois = new ArrayList<Tournoi>();
	public List<Joueur> joueurs = new ArrayList<Joueur>();
	public List<Match> matches = new ArrayList<Match>();
}