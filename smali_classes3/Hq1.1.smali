.class public final synthetic LHq1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/h;


# instance fields
.field public final synthetic b:Z

.field public final synthetic c:LYq1;

.field public final synthetic d:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(ZLYq1;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, LHq1;->b:Z

    iput-object p2, p0, LHq1;->c:LYq1;

    iput-object p3, p0, LHq1;->d:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final g(Lio/reactivex/f;)V
    .locals 3

    iget-boolean v0, p0, LHq1;->b:Z

    iget-object v1, p0, LHq1;->c:LYq1;

    iget-object v2, p0, LHq1;->d:Ljava/lang/String;

    invoke-static {v0, v1, v2, p1}, LYq1;->b(ZLYq1;Ljava/lang/String;Lio/reactivex/f;)V

    return-void
.end method
