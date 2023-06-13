package ch.qos.logback.core.subst;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.spi.ScanException;
import ch.qos.logback.core.subst.Node;
import ch.qos.logback.core.subst.Token;
import java.util.List;
/* loaded from: classes.dex */
public class Parser {
    int pointer = 0;
    final List<Token> tokenList;

    /* renamed from: ch.qos.logback.core.subst.Parser$1 */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C136401 {
        static final /* synthetic */ int[] $SwitchMap$ch$qos$logback$core$subst$Token$Type;

        static {
            int[] iArr = new int[Token.Type.values().length];
            $SwitchMap$ch$qos$logback$core$subst$Token$Type = iArr;
            try {
                iArr[Token.Type.LITERAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$ch$qos$logback$core$subst$Token$Type[Token.Type.CURLY_LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$ch$qos$logback$core$subst$Token$Type[Token.Type.START.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public Parser(List<Token> list) {
        this.tokenList = list;
    }

    /* renamed from: C */
    private Node m61062C() throws ScanException {
        Node m61061E = m61061E();
        if (isDefaultToken(peekAtCurentToken())) {
            advanceTokenPointer();
            m61061E.append(makeNewLiteralNode(CoreConstants.DEFAULT_VALUE_SEPARATOR));
            m61061E.append(m61061E());
        }
        return m61061E;
    }

    /* renamed from: E */
    private Node m61061E() throws ScanException {
        Node m61060T = m61060T();
        if (m61060T == null) {
            return null;
        }
        Node Eopt = Eopt();
        if (Eopt != null) {
            m61060T.append(Eopt);
        }
        return m61060T;
    }

    private Node Eopt() throws ScanException {
        if (peekAtCurentToken() == null) {
            return null;
        }
        return m61061E();
    }

    /* renamed from: T */
    private Node m61060T() throws ScanException {
        Token peekAtCurentToken = peekAtCurentToken();
        int i = C136401.$SwitchMap$ch$qos$logback$core$subst$Token$Type[peekAtCurentToken.type.ordinal()];
        if (i == 1) {
            advanceTokenPointer();
            return makeNewLiteralNode(peekAtCurentToken.payload);
        } else if (i != 2) {
            if (i != 3) {
                return null;
            }
            advanceTokenPointer();
            Node m61059V = m61059V();
            expectCurlyRight(peekAtCurentToken());
            advanceTokenPointer();
            return m61059V;
        } else {
            advanceTokenPointer();
            Node m61062C = m61062C();
            expectCurlyRight(peekAtCurentToken());
            advanceTokenPointer();
            Node makeNewLiteralNode = makeNewLiteralNode(CoreConstants.LEFT_ACCOLADE);
            makeNewLiteralNode.append(m61062C);
            makeNewLiteralNode.append(makeNewLiteralNode(CoreConstants.RIGHT_ACCOLADE));
            return makeNewLiteralNode;
        }
    }

    /* renamed from: V */
    private Node m61059V() throws ScanException {
        Node node = new Node(Node.Type.VARIABLE, m61061E());
        if (isDefaultToken(peekAtCurentToken())) {
            advanceTokenPointer();
            node.defaultPart = m61061E();
        }
        return node;
    }

    private boolean isDefaultToken(Token token) {
        return token != null && token.type == Token.Type.DEFAULT;
    }

    private Node makeNewLiteralNode(String str) {
        return new Node(Node.Type.LITERAL, str);
    }

    public void advanceTokenPointer() {
        this.pointer++;
    }

    public void expectCurlyRight(Token token) throws ScanException {
        expectNotNull(token, "}");
        if (token.type != Token.Type.CURLY_RIGHT) {
            throw new ScanException("Expecting }");
        }
    }

    public void expectNotNull(Token token, String str) {
        if (token != null) {
            return;
        }
        throw new IllegalArgumentException("All tokens consumed but was expecting \"" + str + "\"");
    }

    public Node parse() throws ScanException {
        List<Token> list = this.tokenList;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return m61061E();
    }

    public Token peekAtCurentToken() {
        if (this.pointer < this.tokenList.size()) {
            return this.tokenList.get(this.pointer);
        }
        return null;
    }
}
