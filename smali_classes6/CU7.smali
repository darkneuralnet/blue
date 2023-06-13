.class public final LCU7;
.super LZt7;
.source "SourceFile"

# interfaces
.implements Lgv7;


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, LTV7;->E()LTV7;

    move-result-object v0

    invoke-direct {p0, v0}, LZt7;-><init>(Leu7;)V

    return-void
.end method

.method public synthetic constructor <init>(LcU7;)V
    .locals 0

    invoke-static {}, LTV7;->E()LTV7;

    move-result-object p1

    invoke-direct {p0, p1}, LZt7;-><init>(Leu7;)V

    return-void
.end method


# virtual methods
.method public final p(Ljava/lang/String;)LCU7;
    .locals 1

    iget-boolean p1, p0, LZt7;->d:Z

    if-eqz p1, :cond_0

    invoke-virtual {p0}, LZt7;->o()V

    const/4 p1, 0x0

    iput-boolean p1, p0, LZt7;->d:Z

    :cond_0
    iget-object p1, p0, LZt7;->c:Leu7;

    check-cast p1, LTV7;

    const-string v0, "MobileObjectLocalizerV3_1TfLiteClient"

    invoke-static {p1, v0}, LTV7;->F(LTV7;Ljava/lang/String;)V

    return-object p0
.end method

.method public final q(J)LCU7;
    .locals 2

    iget-boolean p1, p0, LZt7;->d:Z

    if-eqz p1, :cond_0

    invoke-virtual {p0}, LZt7;->o()V

    const/4 p1, 0x0

    iput-boolean p1, p0, LZt7;->d:Z

    :cond_0
    iget-object p1, p0, LZt7;->c:Leu7;

    check-cast p1, LTV7;

    const-wide/32 v0, 0x493e0

    invoke-static {p1, v0, v1}, LTV7;->G(LTV7;J)V

    return-object p0
.end method
