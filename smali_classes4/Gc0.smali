.class public final synthetic LGc0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lco/bird/android/widget/CameraxView;

.field public final synthetic c:Ljava/lang/Runnable;


# direct methods
.method public synthetic constructor <init>(Lco/bird/android/widget/CameraxView;Ljava/lang/Runnable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LGc0;->b:Lco/bird/android/widget/CameraxView;

    iput-object p2, p0, LGc0;->c:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LGc0;->b:Lco/bird/android/widget/CameraxView;

    iget-object v1, p0, LGc0;->c:Ljava/lang/Runnable;

    invoke-static {v0, v1}, Lco/bird/android/widget/CameraxView;->a(Lco/bird/android/widget/CameraxView;Ljava/lang/Runnable;)V

    return-void
.end method
