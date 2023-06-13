.class public final synthetic LcW2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/a;


# instance fields
.field public final synthetic b:LeW2;

.field public final synthetic c:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(LeW2;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LcW2;->b:LeW2;

    iput-object p2, p0, LcW2;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LcW2;->b:LeW2;

    iget-object v1, p0, LcW2;->c:Ljava/lang/String;

    invoke-static {v0, v1}, LeW2;->b(LeW2;Ljava/lang/String;)V

    return-void
.end method
