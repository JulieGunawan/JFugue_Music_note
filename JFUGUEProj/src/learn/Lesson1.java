package learn;
import org.jfugue.player.Player;

public class Lesson1 {

	public static void main(String[] args) {
		//part_2();
		part_3();
	}
	
	public static void part_2() {
		String music = "C4q D4q E4q F4q G4q A4q B4q C4q";
		
		//Get A JFugue 5 Player
		Player player = new Player();
		
		//Play music
		player.play(music);
	}
	
	public static void part_3() {
		String[] c_major_scale = new String[] {
				"C4q", "D4q", "E4q", "F4q", "G4q", "A4q", "B4q", "C4q"};
		
		int[] pat = new int[] {0,1,2,0,0,1,2,0,2,3,4,2,3,4};
		
		String music = "";
		
		for (int i=0; i<pat.length;i++) {
			music += c_major_scale[pat[i]]+" ";			
		}
		
		/*for (int i=0; i<pat.length; i++) {
			music += c_major_scale[pat[pat.length-1-i]]+" ";
		}*/
		
		Player player = new Player();
		
		player.play(music);
	}
	
	//make a chord
	public static void part_4() {
		
		String[] c_major_scale = new String[] {
				"C4q", "D4q", "E4q", "F4q", "G4q", "A4q", "B4q"};
		
		int[] pat = new int[] {0,1,2,3,1,2,3,4,2,3,4,6,5,4,6,4,5,0};
		
		String music = "";
		
		for (int i=0; i<pat.length; i++) {
			if(i%2==0)
				music += c_major_scale[pat[i]]+"+"+
			    c_major_scale[(pat[i]+2)%c_major_scale.length]+"+"+
			    c_major_scale[(pat[i]+4)%c_major_scale.length]+" ";
			else
				music += c_major_scale[pat[i]]+" ";	
		}
		
		for (int i=0; i<pat.length;i++) {
			if(i%2==0)
				music += c_major_scale[pat[pat.length-1-i]]+"+"+
				c_major_scale[(pat[pat.length-1-i]+2)%c_major_scale.length];
			else
				music += c_major_scale[pat[i]]+" ";
		}
		
		for (int i=0; i<pat.length;i++) {
			if(i%2==0)
				music += c_major_scale[pat[pat.length-1-i]]+"+"+
				c_major_scale[(pat[pat.length-1-i]+2)%c_major_scale.length] + "+"+
				c_major_scale[(pat[pat.length-1-i]+4)%c_major_scale.length]+ " ";
			else
				music += c_major_scale[pat[pat.length-1-i]]+" ";
		}
		
		Player player = new Player();
		
		player.play(music);
		
	}
}
