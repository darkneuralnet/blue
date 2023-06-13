.class public LSU2$a;
.super LuE2;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LSU2;-><init>(J)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LuE2<",
        "LSU2$b<",
        "TA;>;TB;>;"
    }
.end annotation


# instance fields
.field public final synthetic e:LSU2;


# direct methods
.method public constructor <init>(LSU2;J)V
    .locals 0

    iput-object p1, p0, LSU2$a;->e:LSU2;

    invoke-direct {p0, p2, p3}, LuE2;-><init>(J)V

    return-void
.end method


# virtual methods
.method public bridge synthetic j(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, LSU2$b;

    invoke-virtual {p0, p1, p2}, LSU2$a;->n(LSU2$b;Ljava/lang/Object;)V

    return-void
.end method

.method public n(LSU2$b;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LSU2$b<",
            "TA;>;TB;)V"
        }
    .end annotation

    invoke-virtual {p1}, LSU2$b;->c()V

    return-void
.end method
