package util;

public class Const {

	public static final String MATH_BINARY_FILENAME =
			"data\\student_math_binary.arff";
	public static final String MATH_GRADE_FILENAME = 
			"data\\student_math_grade.arff";
	
	public static final String ATTR_EVAL_RESULTS_FILENAME =
			"data\\student_math_attrEvalResults.txt";
	
	public static final String GOOD_BAD_ATTR_FILENAME =
			"data\\student_math_goodBadAttr.txt";
	
	public static final String SUBSETS_FILENAME =
			"data\\subsets.txt";
	public static final int NUM_SUBSETS = 5;
	
	public static final String SUBSETS_EVAL_RESULTS_FILENAME =
			"data\\student_math_subsetEvalResults.txt";
	
	public static final int TOP_N = 5;
	
	public static final int CROSS_VALIDATION_FOLDS = 10;
	
	public static final String[] MODELS = {
		"Naive Bayes",
		"Decision Tree",
		"Random Forest",
		"NN (MLP)",
		"SVM",
		"k-NN (k = 9)"
	};
}
