**JavaAir**
Creating a model of a system that would allow individuals to manage their flights. 

**Assumption regarding the individuals:**
- Each passenger bag weighs the same
- Planes reserve half of their total weight for the passengers' bags
- The weight of bag per person is the weight reserved for passengers' bags divided by the capacity
- Passengers exist for a single flight only, no return flights here

**MVP:**
Passenger
- Has a name
- Has a number of bags

**CabinCrewMember**
- Has a name
- Has a rank(ENUM)

**Pilot**
- Has a name
- Has a rank
- Has a pilot licence number

**Plane**
- Has a plane type(ENUM)

**Flight**
- Has at least one pilot
- Has a list of CabinCrewMembers
- Has an empty list for passengers
- Has a Plane
- Has a flight number
- Has a destination
- Has a departure airport
- Has a departure time

- Flight should be able to;
  - Return the number of seats avaliable
  - Book a passenger (if there are remaining seats)

- Pilot should be able to;
  - Fly the plane, here a method that returns a String

- CabinCrewMember should be able to:
  - Be able to relay messages, here a method that returns a String 
