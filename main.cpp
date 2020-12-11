/*----------------------------------------------------------------------------*/
/*                                                                            */
/*    Module:       main.cpp                                                  */
/*    Author:       C:\Users\u17m0                                            */
/*    Created:      Fri Nov 06 2020                                           */
/*    Description:  V5 project                                                */
/*                                                                            */
/*----------------------------------------------------------------------------*/

// ---- START VEXCODE CONFIGURED DEVICES ----
// ---- END VEXCODE CONFIGURED DEVICES ----

#include "vex.h"

using namespace vex;

int main() {
  // Initializing Robot Configuration. DO NOT REMOVE!
  vexcodeInit();
  int x,y;
  while(true){
    if(Controller1.Axis1.position()>0){
      x=50;

    }
    else if(Controller1.Axis1.position()<0){
      x=-50;}
      else{x=0;
      }

      if(Controller1.Axis2.position()>0){
      y=50;

    }
    else if(Controller1.Axis2.position()<0){
      y=-50;}
      else{y=0;
      }
      
      
      right.spin(forward,y-x,pct);
      left.spin(forward,y+x,pct);


  }
  
}
