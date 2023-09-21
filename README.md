# ShopManagmentSystem

### WHO?
The Shop Management System (SMS) will be used in automotive repair shops to aid in organizing the inflow and outflow of cars by creating a central database that keeps car information and statistics.
### WHY?
Without a central database, information travels by word of mouth. While this may be sufficient for a very small shop, once there are multiple people involved there will inherently be more confusion. This will lead to asking everyone in the shop for a specific piece of information or even needing to call a mechanic on their off day. Of course, this will result in delays which will in turn cause a profit drop.
### WHAT?
This tool is an interface to manage all shop operations. Customers’ information, including all cars they own, will be stored on a local server. When cars arrive on the lot, their information and work order will be stored on the computer. When the car is ready to be worked on, a mechanic will be able to check the work order online. As the mechanic works, s/he will input comments as to what maintenance he recommends and the status of the car. When the mechanic signs off on the car, the office will know to call the customer to tell them their car is ready.
### HOW?
When the customer arrives, they will enter the office where their information will be inserted into the system. If they are a new customer, their car information will be added as well (make, model, odometer, etc). If they are an existing customer, just enter their name and a list of their previously brought in cars will pop up. Simply specify which car it is (or add a new one if they have a new car). Then you will be able to add a new work order. If the car needs expedited service, just specify that in the order and it will be placed at the front of the queue.
When a mechanic becomes available, they will check the SMS which will tell them which car needs to be worked on and its accompanying work order. The system will give a suggestion of additional work that should be checked based on previous workorders and the current odometer (ie 5000 miles since last oil change or 20000 miles since last brake flush). After the initial drive/inspections (to see how the car preforms) he will input into the system what parts the car needs.
When the office sees that the mechanic finished his initial inspection, they will call the customer to let them know what needs to be fixed and an estimate of how much it will cost.
After customer affirmation, the office will be able to order the correct parts (without leaving the office) and confirm the work order. Once/as the parts come in, the office will check it in, signaling to the mechanic that work is ready to be done on the car.
Once the mechanic finishes the job, he will write in what he did and if there was anything eventful. Adding this information could prove useful in future work orders. After the mechanic signs off on the order, it will return to the office where they can call the customer for pickup.
 
# DATA MODEL
Data is rarely duplicated and we use extends to make our code more concise and usable. The following is a diagram of how our classes interact with each other. 
![image](https://github.com/Zemankow/ShopManagmentSystem/assets/36213811/cf4a3b79-c4ae-46cf-9b04-ac2472da75f9)
