.class public final LXt8;
.super LZt7;
.source "SourceFile"

# interfaces
.implements Lgv7;


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, Lmu8;->E()Lmu8;

    move-result-object v0

    invoke-direct {p0, v0}, LZt7;-><init>(Leu7;)V

    return-void
.end method

.method public synthetic constructor <init>(LYs8;)V
    .locals 0

    invoke-static {}, Lmu8;->E()Lmu8;

    move-result-object p1

    invoke-direct {p0, p1}, LZt7;-><init>(Leu7;)V

    return-void
.end method


# virtual methods
.method public final p(Ljava/lang/String;)LXt8;
    .locals 1

    iget-boolean p1, p0, LZt7;->d:Z

    if-eqz p1, :cond_0

    invoke-virtual {p0}, LZt7;->o()V

    const/4 p1, 0x0

    iput-boolean p1, p0, LZt7;->d:Z

    :cond_0
    iget-object p1, p0, LZt7;->c:Leu7;

    check-cast p1, Lmu8;

    const-string v0, "/m/0bl9f"

    invoke-static {p1, v0}, Lmu8;->F(Lmu8;Ljava/lang/String;)V

    return-object p0
.end method

.method public final q(F)LXt8;
    .locals 1

    iget-boolean p1, p0, LZt7;->d:Z

    if-eqz p1, :cond_0

    invoke-virtual {p0}, LZt7;->o()V

    const/4 p1, 0x0

    iput-boolean p1, p0, LZt7;->d:Z

    :cond_0
    iget-object p1, p0, LZt7;->c:Leu7;

    check-cast p1, Lmu8;

    const v0, 0x3eeb851f    # 0.46f

    invoke-static {p1, v0}, Lmu8;->G(Lmu8;F)V

    return-object p0
.end method
