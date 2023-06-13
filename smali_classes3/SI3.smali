.class public final synthetic LSI3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/B;


# instance fields
.field public final synthetic b:LZI3;

.field public final synthetic c:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(LZI3;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LSI3;->b:LZI3;

    iput-object p2, p0, LSI3;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final subscribe(Lio/reactivex/D;)V
    .locals 2

    iget-object v0, p0, LSI3;->b:LZI3;

    iget-object v1, p0, LSI3;->c:Ljava/lang/String;

    invoke-static {v0, v1, p1}, LZI3;->e(LZI3;Ljava/lang/String;Lio/reactivex/D;)V

    return-void
.end method
