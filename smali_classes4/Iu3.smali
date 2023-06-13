.class public final synthetic LIu3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Z

.field public final synthetic c:Lco/bird/android/widget/actions/OperatorTaskActionBottomSheet;


# direct methods
.method public synthetic constructor <init>(ZLco/bird/android/widget/actions/OperatorTaskActionBottomSheet;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, LIu3;->b:Z

    iput-object p2, p0, LIu3;->c:Lco/bird/android/widget/actions/OperatorTaskActionBottomSheet;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-boolean v0, p0, LIu3;->b:Z

    iget-object v1, p0, LIu3;->c:Lco/bird/android/widget/actions/OperatorTaskActionBottomSheet;

    invoke-static {v0, v1}, Lco/bird/android/widget/actions/OperatorTaskActionBottomSheet;->a(ZLco/bird/android/widget/actions/OperatorTaskActionBottomSheet;)V

    return-void
.end method
