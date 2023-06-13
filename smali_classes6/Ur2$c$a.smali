.class public LUr2$c$a;
.super LUr2$d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LUr2$c;->iterator()Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LUr2<",
        "TK;TV;>.d<TK;>;"
    }
.end annotation


# instance fields
.field public final synthetic f:LUr2$c;


# direct methods
.method public constructor <init>(LUr2$c;)V
    .locals 0

    iput-object p1, p0, LUr2$c$a;->f:LUr2$c;

    iget-object p1, p1, LUr2$c;->b:LUr2;

    invoke-direct {p0, p1}, LUr2$d;-><init>(LUr2;)V

    return-void
.end method


# virtual methods
.method public next()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TK;"
        }
    .end annotation

    invoke-virtual {p0}, LUr2$d;->a()LUr2$e;

    move-result-object v0

    iget-object v0, v0, LUr2$e;->g:Ljava/lang/Object;

    return-object v0
.end method
