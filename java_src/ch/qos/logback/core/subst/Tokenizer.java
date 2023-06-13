package ch.qos.logback.core.subst;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.spi.ScanException;
import ch.qos.logback.core.subst.Token;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class Tokenizer {
    final String pattern;
    final int patternLength;
    TokenizerState state = TokenizerState.LITERAL_STATE;
    int pointer = 0;

    /* renamed from: ch.qos.logback.core.subst.Tokenizer$1 */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C136411 {
        static final /* synthetic */ int[] $SwitchMap$ch$qos$logback$core$subst$Tokenizer$TokenizerState;

        static {
            int[] iArr = new int[TokenizerState.values().length];
            $SwitchMap$ch$qos$logback$core$subst$Tokenizer$TokenizerState = iArr;
            try {
                iArr[TokenizerState.LITERAL_STATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$ch$qos$logback$core$subst$Tokenizer$TokenizerState[TokenizerState.START_STATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$ch$qos$logback$core$subst$Tokenizer$TokenizerState[TokenizerState.DEFAULT_VAL_STATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* loaded from: classes.dex */
    public enum TokenizerState {
        LITERAL_STATE,
        START_STATE,
        DEFAULT_VAL_STATE
    }

    public Tokenizer(String str) {
        this.pattern = str;
        this.patternLength = str.length();
    }

    private void addLiteralToken(List<Token> list, StringBuilder sb) {
        if (sb.length() == 0) {
            return;
        }
        list.add(new Token(Token.Type.LITERAL, sb.toString()));
    }

    private void handleDefaultValueState(char c, List<Token> list, StringBuilder sb) {
        TokenizerState tokenizerState;
        Token token;
        if (c != '$') {
            if (c != '-') {
                sb.append(CoreConstants.COLON_CHAR);
                if (c != '{') {
                    sb.append(c);
                    tokenizerState = TokenizerState.LITERAL_STATE;
                } else {
                    addLiteralToken(list, sb);
                    sb.setLength(0);
                    token = Token.CURLY_LEFT_TOKEN;
                }
            } else {
                token = Token.DEFAULT_SEP_TOKEN;
            }
            list.add(token);
            tokenizerState = TokenizerState.LITERAL_STATE;
        } else {
            sb.append(CoreConstants.COLON_CHAR);
            addLiteralToken(list, sb);
            sb.setLength(0);
            tokenizerState = TokenizerState.START_STATE;
        }
        this.state = tokenizerState;
    }

    private void handleLiteralState(char c, List<Token> list, StringBuilder sb) {
        TokenizerState tokenizerState;
        Token token;
        if (c == '$') {
            addLiteralToken(list, sb);
            sb.setLength(0);
            tokenizerState = TokenizerState.START_STATE;
        } else if (c != ':') {
            if (c == '{') {
                addLiteralToken(list, sb);
                token = Token.CURLY_LEFT_TOKEN;
            } else if (c != '}') {
                sb.append(c);
                return;
            } else {
                addLiteralToken(list, sb);
                token = Token.CURLY_RIGHT_TOKEN;
            }
            list.add(token);
            sb.setLength(0);
            return;
        } else {
            addLiteralToken(list, sb);
            sb.setLength(0);
            tokenizerState = TokenizerState.DEFAULT_VAL_STATE;
        }
        this.state = tokenizerState;
    }

    private void handleStartState(char c, List<Token> list, StringBuilder sb) {
        if (c == '{') {
            list.add(Token.START_TOKEN);
        } else {
            sb.append('$');
            sb.append(c);
        }
        this.state = TokenizerState.LITERAL_STATE;
    }

    public List<Token> tokenize() throws ScanException {
        char c;
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        while (true) {
            int i = this.pointer;
            if (i >= this.patternLength) {
                break;
            }
            char charAt = this.pattern.charAt(i);
            this.pointer++;
            int i2 = C136411.$SwitchMap$ch$qos$logback$core$subst$Tokenizer$TokenizerState[this.state.ordinal()];
            if (i2 == 1) {
                handleLiteralState(charAt, arrayList, sb);
            } else if (i2 == 2) {
                handleStartState(charAt, arrayList, sb);
            } else if (i2 == 3) {
                handleDefaultValueState(charAt, arrayList, sb);
            }
        }
        int i3 = C136411.$SwitchMap$ch$qos$logback$core$subst$Tokenizer$TokenizerState[this.state.ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                c = i3 == 3 ? CoreConstants.COLON_CHAR : '$';
                return arrayList;
            }
            sb.append(c);
        }
        addLiteralToken(arrayList, sb);
        return arrayList;
    }
}
