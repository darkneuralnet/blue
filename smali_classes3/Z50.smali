.class public final synthetic LZ50;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/a;


# instance fields
.field public final synthetic b:Ln60;

.field public final synthetic c:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ln60;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LZ50;->b:Ln60;

    iput-object p2, p0, LZ50;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LZ50;->b:Ln60;

    iget-object v1, p0, LZ50;->c:Ljava/lang/String;

    invoke-static {v0, v1}, Ln60;->j(Ln60;Ljava/lang/String;)V

    return-void
.end method
