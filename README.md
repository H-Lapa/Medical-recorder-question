# Medical-recorder-question

<p>A patient suffering from asthma needs to keep a diary of their “peak flow” breathing
readings. This is just a number between 0 and 800 measuring how well they can
blow air from their lungs. Their peak flow reading is the greatest of three readings
taken at one time.
Write a Java program to help the patient record their peak flow to show their
doctor.
</p>

<p>
The program should first ask the patient for the number their doctor has given them
as being a dangerous reading. Any peak flow reading recorded that is less than the
danger level should lead to a message that they need to go to hospital immediately.
Once entered, this value should not be changed.
</p>

<p>
After storing this number, the program should go into a loop that only stops when
they type 0 instead of a day. It should repeatedly ask them for the day of the month
which is a number from 1 to 31 (they may skip days) and then the three readings
taken that day. All the peak flow readings (ie the largest of each set of three
readings) should be stored. Worryingly low peak flow readings should lead to
warning messages printed as noted above.
</p>

<p>
Once 0 is typed, the program should print the pairs of the day and reading in the
order entered as well as storing them in a file to show to the patient’s Doctor. After
doing so the program should end. Each entry, consisting of the day and reading,
should be printed/stored on a new line. The day and reading should be separated
by a comma (ie CSV / comma separated values format). You may assume that the
report is needed at least once per month so there are never more than 31 readings
to be stored.
</p>

<p>
The program MUST be in procedural programming style to gain marks. It must
use loops, records, methods and arrays. For high marks the program should
correctly implement the above, and be well-structured using methods that take
arguments and return results, with at least one clearly defined abstract data type. It
should have very good style in all other ways (such as indentation, spacing,
naming, etc). 
</p>
