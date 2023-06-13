.class public final LIG8;
.super LwG8;
.source "SourceFile"


# static fields
.field public static final b:LIG8;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LIG8;

    invoke-direct {v0}, LIG8;-><init>()V

    sput-object v0, LIG8;->b:LIG8;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const-string v0, "CharMatcher.none()"

    invoke-direct {p0, v0}, LwG8;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final a(C)Z
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method
