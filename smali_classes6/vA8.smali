.class public final LvA8;
.super LZt7;
.source "SourceFile"

# interfaces
.implements Lgv7;


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, LaH8;->E()LaH8;

    move-result-object v0

    invoke-direct {p0, v0}, LZt7;-><init>(Leu7;)V

    return-void
.end method

.method public synthetic constructor <init>(Lst8;)V
    .locals 0

    invoke-static {}, LaH8;->E()LaH8;

    move-result-object p1

    invoke-direct {p0, p1}, LZt7;-><init>(Leu7;)V

    return-void
.end method


# virtual methods
.method public final p(I)LvA8;
    .locals 1

    iget-boolean p1, p0, LZt7;->d:Z

    if-eqz p1, :cond_0

    invoke-virtual {p0}, LZt7;->o()V

    const/4 p1, 0x0

    iput-boolean p1, p0, LZt7;->d:Z

    :cond_0
    iget-object p1, p0, LZt7;->c:Leu7;

    check-cast p1, LaH8;

    const/4 v0, 0x2

    invoke-static {p1, v0}, LaH8;->F(LaH8;I)V

    return-object p0
.end method
