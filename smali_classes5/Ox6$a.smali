.class public LOx6$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LOx6;->a(IILjava/lang/String;IIILgg1;)Lio/reactivex/Observable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lio/reactivex/functions/o<",
        "Ljava/lang/Long;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:I

.field public final synthetic d:I

.field public final synthetic e:I

.field public final synthetic f:Lgg1;

.field public final synthetic g:LOx6;


# direct methods
.method public constructor <init>(LOx6;Ljava/lang/String;IIILgg1;)V
    .locals 0

    iput-object p1, p0, LOx6$a;->g:LOx6;

    iput-object p2, p0, LOx6$a;->b:Ljava/lang/String;

    iput p3, p0, LOx6$a;->c:I

    iput p4, p0, LOx6$a;->d:I

    iput p5, p0, LOx6$a;->e:I

    iput-object p6, p0, LOx6$a;->f:Lgg1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Long;)Ljava/lang/Boolean;
    .locals 6

    iget-object v0, p0, LOx6$a;->g:LOx6;

    iget-object v1, p0, LOx6$a;->b:Ljava/lang/String;

    iget v2, p0, LOx6$a;->c:I

    iget v3, p0, LOx6$a;->d:I

    iget v4, p0, LOx6$a;->e:I

    iget-object v5, p0, LOx6$a;->f:Lgg1;

    invoke-virtual/range {v0 .. v5}, LOx6;->f(Ljava/lang/String;IIILgg1;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p0, p1}, LOx6$a;->a(Ljava/lang/Long;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
