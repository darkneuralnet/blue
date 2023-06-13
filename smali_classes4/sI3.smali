.class public final synthetic LsI3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/o;


# instance fields
.field public final synthetic b:Lco/bird/android/model/constant/PartKind;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:LqI3;

.field public final synthetic e:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lco/bird/android/model/constant/PartKind;Ljava/lang/String;LqI3;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LsI3;->b:Lco/bird/android/model/constant/PartKind;

    iput-object p2, p0, LsI3;->c:Ljava/lang/String;

    iput-object p3, p0, LsI3;->d:LqI3;

    iput-object p4, p0, LsI3;->e:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, LsI3;->b:Lco/bird/android/model/constant/PartKind;

    iget-object v1, p0, LsI3;->c:Ljava/lang/String;

    iget-object v2, p0, LsI3;->d:LqI3;

    iget-object v3, p0, LsI3;->e:Ljava/lang/String;

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {v0, v1, v2, v3, p1}, LqI3$c;->c(Lco/bird/android/model/constant/PartKind;Ljava/lang/String;LqI3;Ljava/lang/String;Ljava/lang/Throwable;)Lco/bird/android/model/wire/WirePart;

    move-result-object p1

    return-object p1
.end method
