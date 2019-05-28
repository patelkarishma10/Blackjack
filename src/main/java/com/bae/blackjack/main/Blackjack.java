package com.bae.blackjack.main;


public class Blackjack {

public static void main(String[] args) {
	
}

public int play(int player, int dealer) {
	int winner = 0;
//	if ((player>30 && dealer>21)||(player<4 && dealer<4)||(player>30 && dealer<21)||(player<21 && dealer>30)||(player<3 && dealer<=21)||(player<=21 && dealer<4)) {
//		winner = -1;
//	}
	if ((player>30 && dealer>21)||(player<4 || dealer<4)||(player>30 || dealer>30)) {
		winner = -1;
	}
	else if (player>21 && dealer>21) {
		winner = 0;
	}
	else if (dealer<16 && player >21) {
		int twist = twist();
		if (twist == 11 && dealer>10) {
			twist =1;
		}
		winner = dealer + twist;
	}
	else if ((player>dealer && player<=21) || dealer>21) {
		winner = player;
	}
	else if ((dealer>=player && dealer<=21) || (player>21 && dealer>15) ) {
		winner = dealer;
	}
			
	return winner;
}

public int twist() {
	int card = ((int) (Math.random()*11)+1);
	return card;
	
}
}
