package beyondvision.exercise.fixture;

import beyondvision.exercise.domain.Exercise;

import java.util.List;

public class ExerciseFixture {

    public static final Exercise EXERCISE_1 = new Exercise("레터럴 레이즈", "설명 1", null, 5, 0);

    // 상체: 0, 하체: 1, 코어: 2, 스트레칭: 3
    public static final List<Exercise> EXERCISES = List.of(
            new Exercise("레터럴 레이즈", "어깨 측면 삼각근을 강화하는 가장 기본적이고 대표적인 운동으로 팔을 옆으로 올리는 운동입니다.", null, 3, 0),
            new Exercise("숄더 프레스", "가장 대표적인 전면 삼각근 운동으로 팔을 얼굴 옆에서 수직 방향으로 들어 올리는 동작입니다.", null, 3, 0),
            new Exercise("프론트 레이즈", "전면 삼각근 운동으로 덤벨을 양손으로 잡고 앞으로 어깨높이까지 올린 후 근육을 긴장하며 원래의 자세로 돌아오는 것을 반복합니다.", null, 4, 0),
            new Exercise("스쿼트", "‘웅크리다’는 뜻으로 기본적인 하체 운동이다. 양발을 좌우로 벌리고 서서 발바닥을 바닥에 붙인 채 허벅지가 무릎과 수평이 될 때까지 앉았다 섰다 하는 동작으로 구성된다.", null, 20, 1),
            new Exercise("런지", "하체 근육 성장과 코어 강화, 균형 감각 향상에 효과적인 운동이다. 두 다리를 골반넓이 정도로 벌리고 선 후 한 발을 평소 보폴보다 크게 내딛은 뒤 지탱하는 다리에 체중을 실어 무릎을 90도까지 굽혀 내려간다. 이후 제자리로 돌아온 뒤 해당 동작을 반복한다.", null, 2, 1),
            //new Exercise("닐링 레그 리프트", "설명 6", 10, 20, 1),
            new Exercise("플랭크", "코어근육 강화에도 좋으며 꾸준히 하면 골반 허리, 자세 교정, 다이어트에도 효과적이다. 바닥에 엎드린 뒤 팔꿈치를 굽히고 몸을 들어 올린다. 양쪽 팔과 발로 몸을 지탱하고, 발끝은 정강이 쪽으로 당겨준다. 팔꿈치는 90도를 유지하며 머리와 몸은 일직선이 돼야 한다.", null, 3, 2),
            new Exercise("헌드레드", "필라테스의 대표적인 코어 강화 운동 중 하나이다. 등을 대고 누운 상태에서 두 다리를 붙여서 공중 대각선으로 길게 발끝을 뻗어준 후 자세를 유지하면서 팔을 위아래로 움직이는 동작을 100회 반복한다.", null, 4, 2),
            new Exercise("브릿지", "척추 건강과 자세 교정에 좋은 동작이자 누워서 할수 있는 대표적인 하체 운동이다. 누운 자세에서 무릎을 골반 너비로 벌려 세우고 양손을 바닥에 둔다. 숨을 들이마시면서 엉덩이를 위로 들어 올린다. 엉덩이와 괄약근에 힘을 주며 약 10초 정도 자세를 유지한 후 숨을 천천히 내시면서 등부터 끌어내려 엉덩이를 내린다.", null, 2, 2),
            new Exercise("V", "코어 근육 강화에 도움이 되는 운동이다. 엉덩이뼈과 꼬리뼈 사이에 체중을 실고, 매트에 앉는다. 'V'자 형태를 이루도록 다리를 완전히 똑바르게 펴서 바닥에서 위로 올려주고, 손은 발목을 잡는다.", null, 1, 2)
    );
}
