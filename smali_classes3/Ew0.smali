.class public final synthetic LEw0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/a;


# instance fields
.field public final synthetic b:Z

.field public final synthetic c:LDw0;

.field public final synthetic d:Lco/bird/android/model/persistence/Tutorial;


# direct methods
.method public synthetic constructor <init>(ZLDw0;Lco/bird/android/model/persistence/Tutorial;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, LEw0;->b:Z

    iput-object p2, p0, LEw0;->c:LDw0;

    iput-object p3, p0, LEw0;->d:Lco/bird/android/model/persistence/Tutorial;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-boolean v0, p0, LEw0;->b:Z

    iget-object v1, p0, LEw0;->c:LDw0;

    iget-object v2, p0, LEw0;->d:Lco/bird/android/model/persistence/Tutorial;

    invoke-static {v0, v1, v2}, LDw0$l;->a(ZLDw0;Lco/bird/android/model/persistence/Tutorial;)V

    return-void
.end method
