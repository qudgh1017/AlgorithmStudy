package git.AlgorithmStudy.Programmers;

// ��ų Ʈ��
// ���� ��ų ���� skill
// �������� ���� ��ųƮ��
// �������� ���� ��ų Ʈ������ ������ ��ų Ʈ�� ���� ��ȯ
public class Level2_08 {

	public static void main(String[] args) {
		
		String skill = "CBD";
		String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};
		
		System.out.println(solution(skill, skill_trees));
		
	}
	
	public static int solution(String skill, String[] skill_trees) {
        int answer = 0;
        for(int i=0; i<skill_trees.length; i++)
        {
        	Boolean flag = true;
            String skill_tree =skill_trees[i];
        	int skill_idx = 0;
        	for(int j=0; j<skill_tree.length(); j++)
        	{
        		for(int k=skill_idx; k<skill.length(); k++)
        		{
        			if(skill.charAt(k)==skill_tree.charAt(j))
        			{
        				if(k!=skill_idx)
        					flag = false;
        				else
        					skill_idx++;
        			}
        		}
        	}
        	if(flag)
        		answer++;
        }
        
        return answer;
    }
}
