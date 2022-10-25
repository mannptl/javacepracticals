public class P3_1
{
public static void main(String a[])
{
byte b=10;
short s=20;
int i=22;
long l=29;
float f=23.5f;
double d=60.0d;
char c='f';
Byte bobj=b;
Short shobj=s;
Integer inobj=i;
Long lobj=l;
Float flobj=f;
Double dobj=d;
Character cobj=c;
System.out.println("---Printing object value---");
System.out.println("Byte object: " + bobj);
System.out.println("Short object: " + shobj);
System.out.println("Int object: " + inobj);
System.out.println("Long object: " + lobj);
System.out.println("Float object: " + flobj);
System.out.println("Double object: " + dobj);
System.out.println("Character object: " + cobj);

byte bytevalue=bobj;
short shortvalue=shobj;
int intvalue=inobj;
long longvalue=lobj;
float floatvalue=flobj;
double doublevalue= dobj;
char charvalue=cobj;
System.out.println("------------------------------------");
System.out.println("---Printing primitive value---");
System.out.println("Byte value: " + bytevalue);
System.out.println("Short value: " + shortvalue);
System.out.println("Int value: " + intvalue);
System.out.println("Long value: " + longvalue);
System.out.println("Float value: " + floatvalue);
System.out.println("Double value: " + doublevalue);
System.out.println("Character value: " + charvalue);
}
}
