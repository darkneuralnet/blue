.class public final synthetic LhO8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LaP8;

.field public final synthetic c:LFc8;

.field public final synthetic d:Landroid/app/job/JobParameters;


# direct methods
.method public synthetic constructor <init>(LaP8;LFc8;Landroid/app/job/JobParameters;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LhO8;->b:LaP8;

    iput-object p2, p0, LhO8;->c:LFc8;

    iput-object p3, p0, LhO8;->d:Landroid/app/job/JobParameters;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, LhO8;->b:LaP8;

    iget-object v1, p0, LhO8;->c:LFc8;

    iget-object v2, p0, LhO8;->d:Landroid/app/job/JobParameters;

    invoke-virtual {v0, v1, v2}, LaP8;->d(LFc8;Landroid/app/job/JobParameters;)V

    return-void
.end method
