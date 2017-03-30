class TapeDeckTestDrive {
	public static void main (String[] args) {
		
		TapeDeck t = new TapeDeck(); // fix
		t.canRecord = true;
		t.playTape();
		
		if (t.canRecord == true) {
			t.recordTape();
		}
	}
}