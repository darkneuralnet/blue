.class public Lv12$a;
.super LVY1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lv12;->y()LVY1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LVY1<",
        "TE;>;"
    }
.end annotation


# instance fields
.field public final synthetic d:Lv12;


# direct methods
.method public constructor <init>(Lv12;)V
    .locals 0

    iput-object p1, p0, Lv12$a;->d:Lv12;

    invoke-direct {p0}, LVY1;-><init>()V

    return-void
.end method


# virtual methods
.method public get(I)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TE;"
        }
    .end annotation

    iget-object v0, p0, Lv12$a;->d:Lv12;

    invoke-virtual {v0, p1}, Lv12;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public h()Z
    .locals 1

    iget-object v0, p0, Lv12$a;->d:Lv12;

    invoke-virtual {v0}, LQY1;->h()Z

    move-result v0

    return v0
.end method

.method public size()I
    .locals 1

    iget-object v0, p0, Lv12$a;->d:Lv12;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    return v0
.end method
