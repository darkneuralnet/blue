.class public final Lo0$b;
.super Lo0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# static fields
.field public static final e:Ljava/util/Optional;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Optional<",
            "Ljava/lang/Number;",
            ">;"
        }
    .end annotation
.end field

.field private static final serialVersionUID:J = -0x3de6bfb031caef21L


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Optional;->of(Ljava/lang/Object;)Ljava/util/Optional;

    move-result-object v0

    sput-object v0, Lo0$b;->e:Ljava/util/Optional;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lo0;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lo0$a;)V
    .locals 0

    invoke-direct {p0}, Lo0$b;-><init>()V

    return-void
.end method


# virtual methods
.method public D()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public bridge synthetic b()Lae6;
    .locals 1

    invoke-super {p0}, Lo0;->f()Lo0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lae6;

    invoke-virtual {p0, p1}, Lo0$b;->j(Lae6;)I

    move-result p1

    return p1
.end method

.method public d()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public e(Lo0;)Z
    .locals 0

    invoke-virtual {p0}, Lo0$b;->k()Ljava/lang/IllegalStateException;

    move-result-object p1

    throw p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 0

    instance-of p1, p1, Lo0$b;

    return p1
.end method

.method public g()Lo0;
    .locals 1

    invoke-virtual {p0}, Lo0$b;->k()Ljava/lang/IllegalStateException;

    move-result-object v0

    throw v0
.end method

.method public h(Lo0;)Lo0;
    .locals 0

    invoke-virtual {p0}, Lo0$b;->k()Ljava/lang/IllegalStateException;

    move-result-object p1

    throw p1
.end method

.method public hashCode()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public i()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public j(Lae6;)I
    .locals 0

    instance-of p1, p1, Lo0$b;

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    const/4 p1, -0x1

    return p1
.end method

.method public final k()Ljava/lang/IllegalStateException;
    .locals 2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "code was reached, that is expected unreachable"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    return-object v0
.end method
