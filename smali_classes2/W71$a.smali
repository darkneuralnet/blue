.class public LW71$a;
.super LgE2;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LW71;->f(LgE2;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LgE2<",
        "Ljava/lang/Float;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic d:LgE2;

.field public final synthetic e:LW71;


# direct methods
.method public constructor <init>(LW71;LgE2;)V
    .locals 0

    iput-object p1, p0, LW71$a;->e:LW71;

    iput-object p2, p0, LW71$a;->d:LgE2;

    invoke-direct {p0}, LgE2;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(LTD2;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, LW71$a;->d(LTD2;)Ljava/lang/Float;

    move-result-object p1

    return-object p1
.end method

.method public d(LTD2;)Ljava/lang/Float;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LTD2<",
            "Ljava/lang/Float;",
            ">;)",
            "Ljava/lang/Float;"
        }
    .end annotation

    iget-object v0, p0, LW71$a;->d:LgE2;

    invoke-virtual {v0, p1}, LgE2;->a(LTD2;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Float;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    const v0, 0x40233333    # 2.55f

    mul-float/2addr p1, v0

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    return-object p1
.end method
