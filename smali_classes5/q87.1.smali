.class public final Lq87;
.super Lab7;
.source "SourceFile"

# interfaces
.implements LUb7;


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, Lr87;->F()Lr87;

    move-result-object v0

    invoke-direct {p0, v0}, Lab7;-><init>(Lfb7;)V

    return-void
.end method

.method public synthetic constructor <init>(Lp87;)V
    .locals 0

    invoke-static {}, Lr87;->F()Lr87;

    move-result-object p1

    invoke-direct {p0, p1}, Lab7;-><init>(Lfb7;)V

    return-void
.end method


# virtual methods
.method public final t(Lt87;)Lq87;
    .locals 1

    invoke-virtual {p0}, Lab7;->q()V

    iget-object v0, p0, Lab7;->c:Lfb7;

    check-cast v0, Lr87;

    invoke-virtual {p1}, Lab7;->o()Lfb7;

    move-result-object p1

    check-cast p1, Lv87;

    invoke-static {v0, p1}, Lr87;->G(Lr87;Lv87;)V

    return-object p0
.end method
