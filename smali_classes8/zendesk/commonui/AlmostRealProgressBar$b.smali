.class public Lzendesk/commonui/AlmostRealProgressBar$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzendesk/commonui/AlmostRealProgressBar;->p(J)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:J

.field public final synthetic c:Lzendesk/commonui/AlmostRealProgressBar;


# direct methods
.method public constructor <init>(Lzendesk/commonui/AlmostRealProgressBar;J)V
    .locals 0

    iput-object p1, p0, Lzendesk/commonui/AlmostRealProgressBar$b;->c:Lzendesk/commonui/AlmostRealProgressBar;

    iput-wide p2, p0, Lzendesk/commonui/AlmostRealProgressBar$b;->b:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lzendesk/commonui/AlmostRealProgressBar$b;->c:Lzendesk/commonui/AlmostRealProgressBar;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lzendesk/commonui/AlmostRealProgressBar;->e(Lzendesk/commonui/AlmostRealProgressBar;Ljava/lang/Runnable;)Ljava/lang/Runnable;

    iget-object v0, p0, Lzendesk/commonui/AlmostRealProgressBar$b;->c:Lzendesk/commonui/AlmostRealProgressBar;

    iget-wide v1, p0, Lzendesk/commonui/AlmostRealProgressBar$b;->b:J

    invoke-static {v0, v1, v2}, Lzendesk/commonui/AlmostRealProgressBar;->f(Lzendesk/commonui/AlmostRealProgressBar;J)V

    return-void
.end method
