.class public LMp0$a;
.super LMp0$e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LMp0;->J()Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LMp0<",
        "TK;TV;>.e<TK;>;"
    }
.end annotation


# instance fields
.field public final synthetic f:LMp0;


# direct methods
.method public constructor <init>(LMp0;)V
    .locals 1

    iput-object p1, p0, LMp0$a;->f:LMp0;

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, LMp0$e;-><init>(LMp0;LMp0$a;)V

    return-void
.end method


# virtual methods
.method public b(I)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TK;"
        }
    .end annotation

    iget-object v0, p0, LMp0$a;->f:LMp0;

    invoke-static {v0, p1}, LMp0;->b(LMp0;I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
