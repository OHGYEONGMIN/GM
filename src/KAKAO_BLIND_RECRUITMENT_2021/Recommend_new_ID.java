package KAKAO_BLIND_RECRUITMENT_2021;
// �ű� ���̵� ��õ
// �׽�Ʈ�ڵ� 23,25 ������� ���� ����
public class Recommend_new_ID {
	
	class Solution {
	    public String solution(String new_id) {
	        if((new_id.length()>=1) && (new_id.length()<=1000)){
	        new_id = new_id.toLowerCase();
			String[] puncts = { "~", "!", "@", "#", "$", "%", "^", "&", "*", "(", ")", "=", "+", "[", "{", "]", "}", ":",
					"?", ",", "<", ">", "/" };
//			new_id = new_id.replaceAll("\\p{Punct}", ""); //�̰� �ѹ��� Ư������ �� ����
			for (String a : puncts) {
				if (new_id.contains(a)) {
					new_id = new_id.replace(a, "");
				}
			}
			for (int i = 0; i < new_id.length(); i++) {
				new_id = new_id.replace("..", ".");
			}
	if(new_id.length()>0) {
			if ((".".equals(new_id.substring(0, 1)) || (".".equals(new_id.substring(new_id.length() - 1))))) {
				if ((".".equals(new_id.substring(0, 1))) && (".".equals(new_id.substring(new_id.length() - 1)))) {
					if (new_id.length() == 1) {
						new_id = new_id.replace(".", "");
					} else {
						new_id = new_id.substring(1, new_id.length() - 1);
					}
				} else if (".".equals(new_id.substring(new_id.length()-1))) {
					new_id = new_id.substring(0, new_id.length() - 1);
				} else if (".".equals(new_id.substring(0, 1))) {
					new_id = new_id.substring(1);
				}
			}
	}
	        if(".".equals(new_id)) {
				new_id = new_id.replaceAll(".", "");
			}
			if ("".equals(new_id)) {
				new_id = "a";
			}
			if (new_id.length() >= 16) {
				new_id = new_id.substring(0, 15);
				if (".".equals(new_id.substring(new_id.length() - 1))) {
					new_id = new_id.substring(0, new_id.length() - 1);
				}
			} else if (new_id.length() <= 2) {
				if (new_id.length() == 1) {
					new_id = new_id.substring(0) + new_id.substring(new_id.length() - 1)
							+ new_id.substring(new_id.length() - 1);
				} else {
					new_id = new_id.substring(0) + new_id.substring(new_id.length() - 1);
				}
			}
	    }
			String answer = new_id;
			return answer;
	        
	    }
	}

}
