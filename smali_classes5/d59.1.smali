.class public final Ld59;
.super LFZ8;
.source "SourceFile"


# static fields
.field public static final b:Ld59;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Ld59;

    invoke-direct {v0}, Ld59;-><init>()V

    sput-object v0, Ld59;->b:Ld59;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const-string v0, "CharMatcher.none()"

    invoke-direct {p0, v0}, LFZ8;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final a(C)Z
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method
