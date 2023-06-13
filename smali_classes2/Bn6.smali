.class public final synthetic LBn6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/a;


# instance fields
.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Lzn6;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Lzn6;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LBn6;->b:Ljava/lang/String;

    iput-object p2, p0, LBn6;->c:Lzn6;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LBn6;->b:Ljava/lang/String;

    iget-object v1, p0, LBn6;->c:Lzn6;

    invoke-static {v0, v1}, Lzn6$c;->a(Ljava/lang/String;Lzn6;)V

    return-void
.end method
