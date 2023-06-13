.class public final synthetic LwB;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lco/bird/android/core/map/BaseMapActivity;

.field public final synthetic c:LcD1;


# direct methods
.method public synthetic constructor <init>(Lco/bird/android/core/map/BaseMapActivity;LcD1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LwB;->b:Lco/bird/android/core/map/BaseMapActivity;

    iput-object p2, p0, LwB;->c:LcD1;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LwB;->b:Lco/bird/android/core/map/BaseMapActivity;

    iget-object v1, p0, LwB;->c:LcD1;

    invoke-static {v0, v1}, Lco/bird/android/core/map/BaseMapActivity;->m0(Lco/bird/android/core/map/BaseMapActivity;LcD1;)V

    return-void
.end method
