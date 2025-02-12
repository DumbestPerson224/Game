#include <iostream>
#include <string>
class Player{
private:
  int player1_lives, player2_lives, player1_ammo, player2_ammo;
  bool is_left, is_right, is_shooting, who_turn;
public:
    void decrement_p1_ammo(){
        if(player1_ammo > 0){
            player1_ammo--;
        }
    }

    void decrement_p2_ammo(){
        if(player2_ammo > 0){
            player2_ammo++;
        }
    }

    void collect_bullet(){
        if(who_turn == 0){
            if(player1_ammo < 10){
                player1_ammo++;
            }
        }else{
            if(player2_ammo < 10){
                player2_ammo++;
            }
        }
    }
};