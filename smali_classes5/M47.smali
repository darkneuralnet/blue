.class public final LM47;
.super Lab7;
.source "SourceFile"

# interfaces
.implements LUb7;


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, LP47;->F()LP47;

    move-result-object v0

    invoke-direct {p0, v0}, Lab7;-><init>(Lfb7;)V

    return-void
.end method

.method public synthetic constructor <init>(LL47;)V
    .locals 0

    invoke-static {}, LP47;->F()LP47;

    move-result-object p1

    invoke-direct {p0, p1}, Lab7;-><init>(Lfb7;)V

    return-void
.end method


# virtual methods
.method public final t(Ljava/lang/String;)LM47;
    .locals 1

    invoke-virtual {p0}, Lab7;->q()V

    iget-object p1, p0, Lab7;->c:Lfb7;

    check-cast p1, LP47;

    const-string v0, "PassThroughCoarseClassifier"

    invoke-static {p1, v0}, LP47;->G(LP47;Ljava/lang/String;)V

    return-object p0
.end method
