.class public LiX2$c$a;
.super LiX2$d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LiX2$c;->c(I)LiX2$d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LiX2$d<",
        "TK0;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:I

.field public final synthetic b:LiX2$c;


# direct methods
.method public constructor <init>(LiX2$c;I)V
    .locals 0

    iput-object p1, p0, LiX2$c$a;->b:LiX2$c;

    iput p2, p0, LiX2$c$a;->a:I

    invoke-direct {p0}, LiX2$d;-><init>()V

    return-void
.end method


# virtual methods
.method public b()LYv5;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:TK0;V:",
            "Ljava/lang/Object;",
            ">()",
            "LYv5<",
            "TK;TV;>;"
        }
    .end annotation

    iget-object v0, p0, LiX2$c$a;->b:LiX2$c;

    invoke-virtual {v0}, LiX2$c;->a()Ljava/util/Map;

    move-result-object v0

    new-instance v1, LiX2$b;

    iget v2, p0, LiX2$c$a;->a:I

    invoke-direct {v1, v2}, LiX2$b;-><init>(I)V

    invoke-static {v0, v1}, LjX2;->d(Ljava/util/Map;LYU5;)LYv5;

    move-result-object v0

    return-object v0
.end method
