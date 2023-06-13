.class public Lzendesk/commonui/AlmostRealProgressBar$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzendesk/commonui/AlmostRealProgressBar;->n(Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Ljava/util/List;

.field public final synthetic c:Lzendesk/commonui/AlmostRealProgressBar;


# direct methods
.method public constructor <init>(Lzendesk/commonui/AlmostRealProgressBar;Ljava/util/List;)V
    .locals 0

    iput-object p1, p0, Lzendesk/commonui/AlmostRealProgressBar$a;->c:Lzendesk/commonui/AlmostRealProgressBar;

    iput-object p2, p0, Lzendesk/commonui/AlmostRealProgressBar$a;->b:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lzendesk/commonui/AlmostRealProgressBar$a;->c:Lzendesk/commonui/AlmostRealProgressBar;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lzendesk/commonui/AlmostRealProgressBar;->a(Lzendesk/commonui/AlmostRealProgressBar;Ljava/lang/Runnable;)Ljava/lang/Runnable;

    iget-object v0, p0, Lzendesk/commonui/AlmostRealProgressBar$a;->b:Ljava/util/List;

    invoke-static {v0}, Ljm0;->c(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    iget-object v1, p0, Lzendesk/commonui/AlmostRealProgressBar$a;->c:Lzendesk/commonui/AlmostRealProgressBar;

    invoke-static {v1, v0}, Lzendesk/commonui/AlmostRealProgressBar;->c(Lzendesk/commonui/AlmostRealProgressBar;Ljava/util/List;)Ljava/util/List;

    iget-object v0, p0, Lzendesk/commonui/AlmostRealProgressBar$a;->c:Lzendesk/commonui/AlmostRealProgressBar;

    invoke-static {v0}, Lzendesk/commonui/AlmostRealProgressBar;->b(Lzendesk/commonui/AlmostRealProgressBar;)Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lzendesk/commonui/AlmostRealProgressBar;->d(Lzendesk/commonui/AlmostRealProgressBar;Ljava/util/List;I)V

    return-void
.end method
