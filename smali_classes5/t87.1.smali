.class public final Lt87;
.super Lab7;
.source "SourceFile"

# interfaces
.implements LUb7;


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, Lv87;->F()Lv87;

    move-result-object v0

    invoke-direct {p0, v0}, Lab7;-><init>(Lfb7;)V

    return-void
.end method

.method public synthetic constructor <init>(Ls87;)V
    .locals 0

    invoke-static {}, Lv87;->F()Lv87;

    move-result-object p1

    invoke-direct {p0, p1}, Lab7;-><init>(Lfb7;)V

    return-void
.end method


# virtual methods
.method public final t(Ljava/lang/String;)Lt87;
    .locals 1

    invoke-virtual {p0}, Lab7;->q()V

    iget-object v0, p0, Lab7;->c:Lfb7;

    check-cast v0, Lv87;

    invoke-static {v0, p1}, Lv87;->G(Lv87;Ljava/lang/String;)V

    return-object p0
.end method
