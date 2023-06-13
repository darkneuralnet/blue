.class public final LA27;
.super Lab7;
.source "SourceFile"

# interfaces
.implements LUb7;


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, LF27;->F()LF27;

    move-result-object v0

    invoke-direct {p0, v0}, Lab7;-><init>(Lfb7;)V

    return-void
.end method

.method public synthetic constructor <init>(Ly27;)V
    .locals 0

    invoke-static {}, LF27;->F()LF27;

    move-result-object p1

    invoke-direct {p0, p1}, Lab7;-><init>(Lfb7;)V

    return-void
.end method


# virtual methods
.method public final t(I)LA27;
    .locals 1

    invoke-virtual {p0}, Lab7;->q()V

    iget-object p1, p0, Lab7;->c:Lfb7;

    check-cast p1, LF27;

    const/4 v0, 0x2

    invoke-static {p1, v0}, LF27;->G(LF27;I)V

    return-object p0
.end method
