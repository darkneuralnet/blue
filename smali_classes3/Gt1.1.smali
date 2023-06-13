.class public final synthetic LGt1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/o;


# instance fields
.field public final synthetic b:LQt1;

.field public final synthetic c:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(LQt1;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LGt1;->b:LQt1;

    iput-object p2, p0, LGt1;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LGt1;->b:LQt1;

    iget-object v1, p0, LGt1;->c:Ljava/lang/String;

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {v0, v1, p1}, LQt1;->s(LQt1;Ljava/lang/String;Ljava/lang/Throwable;)Lco/bird/android/model/constant/QuickCaptureState;

    move-result-object p1

    return-object p1
.end method
