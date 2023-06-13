.class public final synthetic LuP2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LwP2;

.field public final synthetic c:Lco/bird/android/model/persistence/nestedstructures/AssetMedia;

.field public final synthetic d:LMT;

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:LTI4;


# direct methods
.method public synthetic constructor <init>(LwP2;Lco/bird/android/model/persistence/nestedstructures/AssetMedia;LMT;Ljava/lang/Object;LTI4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LuP2;->b:LwP2;

    iput-object p2, p0, LuP2;->c:Lco/bird/android/model/persistence/nestedstructures/AssetMedia;

    iput-object p3, p0, LuP2;->d:LMT;

    iput-object p4, p0, LuP2;->e:Ljava/lang/Object;

    iput-object p5, p0, LuP2;->f:LTI4;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, LuP2;->b:LwP2;

    iget-object v1, p0, LuP2;->c:Lco/bird/android/model/persistence/nestedstructures/AssetMedia;

    iget-object v2, p0, LuP2;->d:LMT;

    iget-object v3, p0, LuP2;->e:Ljava/lang/Object;

    iget-object v4, p0, LuP2;->f:LTI4;

    invoke-static {v0, v1, v2, v3, v4}, LwP2;->d(LwP2;Lco/bird/android/model/persistence/nestedstructures/AssetMedia;LMT;Ljava/lang/Object;LTI4;)V

    return-void
.end method
