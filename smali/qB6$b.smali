.class public abstract LqB6$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LqB6;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "b"
.end annotation


# instance fields
.field public b:Landroid/view/WindowInsets;

.field public final c:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, LqB6$b;->c:I

    return-void
.end method


# virtual methods
.method public final b()I
    .locals 1

    iget v0, p0, LqB6$b;->c:I

    return v0
.end method

.method public c(LqB6;)V
    .locals 0

    return-void
.end method

.method public d(LqB6;)V
    .locals 0

    return-void
.end method

.method public abstract e(LDB6;Ljava/util/List;)LDB6;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LDB6;",
            "Ljava/util/List<",
            "LqB6;",
            ">;)",
            "LDB6;"
        }
    .end annotation
.end method

.method public f(LqB6;LqB6$a;)LqB6$a;
    .locals 0

    return-object p2
.end method
